package org.certificatic.tarjetaDigital;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    String SayBye(String text);
}

