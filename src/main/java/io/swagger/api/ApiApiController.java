package io.swagger.api;


import io.swagger.Utils;
import io.swagger.annotations.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.rmi.CORBA.Util;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-06T00:15:59.591Z")

@Controller
public class ApiApiController implements ApiApi {

    public ResponseEntity<Long> fibonacciGet(@ApiParam(value = "The index (n) of the fibonacci sequence", required = true) @RequestParam(value = "n", required = true) Long n) {
        HttpHeaders httpHeaders = new HttpHeaders();
        long result = Utils.fibonacci(n);
        return new ResponseEntity<Long>(result, httpHeaders,HttpStatus.OK);
    }

    public ResponseEntity<Long> reverseWordsGet(@ApiParam(value = "A sentence") @RequestParam(value = "sentence", required = false) String sentence) {
        // do some magic!
        return new ResponseEntity<Long>(HttpStatus.OK);
    }

    public ResponseEntity<String> tokenGet() {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Integer> triangleTypeGet(@ApiParam(value = "The length of side a", required = true) @RequestParam(value = "a", required = true) Integer a,
        @ApiParam(value = "The length of side b", required = true) @RequestParam(value = "b", required = true) Integer b,
        @ApiParam(value = "The length of side c", required = true) @RequestParam(value = "c", required = true) Integer c) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

}
