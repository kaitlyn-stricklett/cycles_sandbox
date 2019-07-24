package kaitlyn.sandbox.domain_single_package.domainB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPApiB implements iSPApiB {
    private SPDomainB domain;

    @Autowired
    public SPApiB(SPDomainB domain) {
        this.domain = domain;
    }
}
