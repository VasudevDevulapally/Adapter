package net.pricefx.integration.processor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by vasudev on 9/5/2016.
 */
public class ProbeProcessor implements Processor {

    public void process(Exchange exchange)throws Exception {

        System.out.println(exchange.getIn().getBody());
    }


}
