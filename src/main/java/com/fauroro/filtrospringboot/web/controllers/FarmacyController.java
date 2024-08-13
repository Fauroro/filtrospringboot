package com.fauroro.filtrospringboot.web.controllers;

import com.fauroro.filtrospringboot.domain.services.farmacy.IFarmacy;
import com.fauroro.filtrospringboot.persistence.entities.Farmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/farmacy")
public class FarmacyController {

    @Autowired
    private IFarmacy farmacyService;

    @GetMapping
    public List<Farmacy> getAll(){
        return farmacyService.findAll();
    }

    @GetMapping("/find/{id}")
    public Optional<Farmacy> getById(@PathVariable int id){
        return farmacyService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Farmacy> postMethodName(@RequestBody Farmacy farmacy){
        Farmacy savedFarmacy = farmacyService.save(farmacy);
        return new ResponseEntity<>(savedFarmacy, HttpStatus.CREATED);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Farmacy> update(@PathVariable int id, @RequestBody Farmacy updatedFarmacy) {
        Optional<Farmacy> optionalFarmacy = farmacyService.update(id, updatedFarmacy);
        return optionalFarmacy.map(farmacy -> new ResponseEntity<>(farmacy, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        Optional<Farmacy> deletedFarmacy = farmacyService.delete(id);
        if (deletedFarmacy.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

//
//
///web.controllers
//
//@RestController
//@RequestMapping("/garden/clients")
//public class ClientController {
//
//    @Autowired
//    private IClient clientService;
//
//    @Autowired
//    private IEmployee employeeService;
//
//    @Autowired
//    private ICity cityService;
//
//    @GetMapping
//    public List<Client> getall() {
//        return clientService.findAllClientsWithDetails();
//    }
//
//    @GetMapping("/employee")
//    public List<Employee> getSalesRep() {
//        return employeeService.findSalesRep();
//    }
//
//    @GetMapping("/order/{status}")
//    public List<Client> getByStatus(@PathVariable String status){
//        return clientService.findAllClientsByOrderStatus(status);
//    }
//
//    @GetMapping("/cities")
//    public List<City> allCities() {
//        return cityService.findAll();
//    }
//
//
//    @GetMapping("/city/{id}")
//    public List<Client> getLessStock(@PathVariable int id){
//        return clientService.findAllClientsByCityId(id);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Client> getMethodName(@PathVariable int id) {
//        Optional<Client> clientOptional = clientService.findById(id);
//        return clientOptional.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping
//    public ResponseEntity<Client> postMethodName(@RequestBody ClientDTO client) {
//        Client savedClient = clientService.save(client);
//
//        if (savedClient.getId() == 0) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
//
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Client> putMethodName(@PathVariable int id, @RequestBody ClientDTO client) {
//        Optional<Client> optionalClient = clientService.update(id,client.getClient(), client.getSalesRepId()) ;
//        return optionalClient.map(clientl -> new ResponseEntity<>(clientl, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable int id){
//        Optional<Client> deletedClient = clientService.delete(id);
//        if (deletedClient.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }
//
//
//}



//
//package com.nasefa.springfinalproject.web.controllers;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.nasefa.springfinalproject.domain.services.gamma.IGamma;
//import com.nasefa.springfinalproject.persistence.entities.Gamma;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//
//@RestController
//@RequestMapping("garden/gamma")
//public class GammaController {
//
//    @Autowired
//    private IGamma service;
//
//    @GetMapping()
//    public List<Gamma> getGammas() {
//        List<Gamma> gammas = service.findAll();
//        return gammas;
//    }
//
//    @GetMapping("/{gammaCode}")
//    public ResponseEntity<Gamma> findById(@PathVariable String gammaCode) {
//        Optional<Gamma> gamma = service.findById(gammaCode);
//        return gamma.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @PostMapping
//    public ResponseEntity<Gamma> create(@RequestBody Gamma gamma) {
//        Gamma savedGamma = service.save(gamma);
//        return new ResponseEntity<>(savedGamma, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{gammaCode}")
//    public ResponseEntity<Gamma> update(@PathVariable String gammaCode, @RequestBody Gamma updatedGamma) {
//        Optional<Gamma> optionalGamma = service.update(gammaCode, updatedGamma);
//        return optionalGamma.map(gamma -> new ResponseEntity<>(gamma, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    @DeleteMapping("/{gammaCode}")
//    public ResponseEntity<Void> delete(@PathVariable String gammaCode) {
//        Optional<Gamma> optionalGamma = service.delete(gammaCode);
//        return optionalGamma.map(gamma -> new ResponseEntity<Void>(HttpStatus.NO_CONTENT))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//}
//