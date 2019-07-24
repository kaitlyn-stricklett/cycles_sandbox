package kaitlyn.sandbox.domain_external_separate.domainA;

import kaitlyn.sandbox.domain_external_separate.domainA.external.ESPojoA;
import kaitlyn.sandbox.domain_external_separate.domainB.external.ESPojoB;
import kaitlyn.sandbox.domain_external_separate.domainB.external.iESApiB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ESDomainA {
    private ESRepoA repo;
    private iESApiB otherApi;

    @Autowired
    ESDomainA(ESRepoA repo, iESApiB otherApi){
        this.repo = repo;
        this.otherApi = otherApi;
    }

    public void saveObj(ESPojoA pojo) {
        ESPojoB b = otherApi.getObj();
        repo.save(new ESEntityA());
    }

    public ESPojoA getObj() {
        return new ESPojoA();
    }
}
