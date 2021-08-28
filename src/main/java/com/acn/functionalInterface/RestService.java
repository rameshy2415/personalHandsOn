package com.acn.functionalInterface;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*@RestController
@RequestMapping("/payment")*/
public class RestService {
    public static final String id = "10";

    @RequestMapping(value = "/pay", method = RequestMethod.POST, consumes = { "application/json" }, produces = { "application/json" }, headers = {
            "content-type=text/plain" })
    public Book getBook(@RequestBody Book request) {
        Book book = new Book();
        request.getAuthName();
        return book;
    }

//	payment/home/fetch?id=10
    @RequestMapping(value = "/home/fetch", method = RequestMethod.POST)
    public Book getBody(@RequestParam("id") String id) {
        Book book = new Book();
        if (id.equals(id)) {

        }

        return book;

    }

//	payment/user/10
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Book getBookdetails(@PathVariable("id") String id) {
        Book book = new Book();
        System.out.println(id);
        return book;
    }

    // home/fetch/category/shirt
    // home/fetch/10/shirt will throw an Exception
    @RequestMapping(value = "/fetch/{id:[a-z]+}/{name}", method = RequestMethod.GET)
    public String getDynamicUriValueRegex(@PathVariable("name") String name) {
        System.out.println("Name is " + name);
        return "Dynamic URI parameter fetched using regex";
    }

    @PostMapping("/person")
    public @ResponseBody ResponseEntity<String> postPerson() {
        return new ResponseEntity<String>("Response from POST method", HttpStatus.OK);
    }

}

/*
 * @GetMapping
 * 
 * @PostMapping
 * 
 * @PutMapping
 * 
 * @DeleteMapping
 * 
 * @PatchMapping
 */
