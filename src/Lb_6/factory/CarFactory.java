package Lb_6.factory;

import Lb_6.*;

public interface CarFactory {
    FerrariInt getFerrari();
    LexusInt getLexus();
    LamborghiniInt getLamborghini();
    ToyotaInt getToyota();
}
