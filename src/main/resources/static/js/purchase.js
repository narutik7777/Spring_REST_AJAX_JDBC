var app = angular.module('purchase', []);

app.controller("PurchaseController", function ($scope, $http) {

    $scope.getStock = function () {
        $http.get('/public/rest/stock').success(function (data, status, headers, config) {
            $scope.stockList = data;
            for (var i = 0; i < $scope.stockList.length; i++) {
                $scope.stockList[i].edit = 0;
            }
        }).error(function (data, status, headers, config) {
            if (data.message === 'Time is out') {
                $scope.finishByTimeout();
            }
        });
    };

    $scope.delete = function (id) {
        $http.delete('/public/rest/purchase/delete/' + id).success(function (data, status, headers, config) {
            for (var i = 0; i < $scope.purchaseList.length; i++) {
                var j = $scope.purchaseList[i];
                if (j.id === id) {
                    $scope.purchaseList.splice(i, 1);
                    break;
                }
            }
        }).error(function (data, status, headers, config) {
            console.error(status, data, headers);
        });
    };

    $scope.addPurchase = function () {
        $http.post('/public/rest/purchase/add/' + $scope.number + "/" + $scope.name).success(function (data, status, headers, config) {
            $scope.purchaseList.splice(0, 0, data);
        }
        ).error(function (data, status, headers, config) {
            console.error(status, data, headers);
        });

    };
});
