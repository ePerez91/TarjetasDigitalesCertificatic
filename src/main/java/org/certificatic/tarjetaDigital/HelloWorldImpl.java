
package org.certificatic.tarjetaDigital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.tarjetaDigital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

    public String SayBye(String text) {
        return "Bye " + text;
    }
    
}

