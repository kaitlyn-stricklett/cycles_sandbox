package kaitlyn.sandbox.domain_external_separate.domainB;

import kaitlyn.sandbox.domain_external_separate.domainB.external.ESPojoB;
import kaitlyn.sandbox.domain_external_separate.domainB.external.iESApiB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ESApiB implements iESApiB {
    private ESDomainB domain;

    @Autowired
    public ESApiB(ESDomainB domain) {
        this.domain = domain;
    }

    @Override public ESPojoB getObj() {
        return domain.getObj();
    }

    @Override public void saveobj(ESPojoB pojo) {
        domain.saveObj(pojo);
    }
}
