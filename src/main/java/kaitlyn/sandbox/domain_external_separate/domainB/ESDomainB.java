package kaitlyn.sandbox.domain_external_separate.domainB;

import kaitlyn.sandbox.domain_external_separate.domainA.external.ESPojoA;
import kaitlyn.sandbox.domain_external_separate.domainA.external.iESApiA;
import kaitlyn.sandbox.domain_external_separate.domainB.external.ESPojoB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ESDomainB {
    private ESRepoB repo;
    private iESApiA otherApi;

    @Autowired
    ESDomainB(ESRepoB repo, iESApiA otherApi){
        this.repo = repo;
        this.otherApi = otherApi;
    }

    public ESPojoB getObj() {
        ESPojoA a = otherApi.getObj();
        return new ESPojoB();
    }

    public void saveObj(ESPojoB pojo) {
        repo.save(new ESEntityB());
    }
}
