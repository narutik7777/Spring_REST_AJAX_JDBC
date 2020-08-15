package IlyasGazizovSpring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import IlyasGazizovSpring.service.PurchaseService;

@RestController
@RequestMapping("/public/rest/purchase")
public class PurchaseRestService {

    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Object> browse() {
        return ResponseEntity.ok(purchaseService.listAll());
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        purchaseService.delete(id);
    }

    @RequestMapping(value = "/add/{quantity}/{name}", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@PathVariable("quantity") Integer quantity, @PathVariable("name") String name) {
        return ResponseEntity.ok(purchaseService.add(quantity, name));
    }

}
