package com.github.carlosedu1999.citiesapi.countries.resources;

import com.github.carlosedu1999.citiesapi.countries.entities.Country;
import com.github.carlosedu1999.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    @Autowired
    private CountryRepository repository;




    @GetMapping
    public List<Country> countries(){

        return repository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Country> getById(@PathVariable long id){
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());

    }
    @PostMapping
    public ResponseEntity<Country> postCountry(@RequestBody Country country){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(country));
    }
    @PutMapping
    public ResponseEntity<Country> putCountry(@RequestBody Country country){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(country));
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        try {
            repository.deleteById(id);
            ResponseEntity.status(HttpStatus.OK).build();
        } catch (IllegalArgumentException e) {
            ResponseEntity.notFound().build();

        }


    }
}
