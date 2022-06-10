package Optionals;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Optional;

public class PresentExamples {

    public static void main(String[] args) {
        //isPresent

        Optional<String> optional = Optional.ofNullable("Hello Atul");
        System.out.println(optional.isPresent());

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }

        //ifPresent

        optional.ifPresent(s-> System.out.println(s));
    }
}
