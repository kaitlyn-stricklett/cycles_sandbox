package kaitlyn.sandbox.domain_external_separate.domainA;

import kaitlyn.sandbox.domain_external_separate.domainA.external.ESPojoA;
import kaitlyn.sandbox.domain_external_separate.domainA.external.iESApiA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ESApiA implements iESApiA {
    private ESDomainA domain;

    @Autowired
    public ESApiA(ESDomainA domain) {
        this.domain = domain;
    }

    @Override public ESPojoA getObj() {
        return domain.getObj();
    }

    @Override public void saveObj(ESPojoA pojo) {
        domain.saveObj(pojo);
    }
}
