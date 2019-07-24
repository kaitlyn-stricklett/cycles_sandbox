package kaitlyn.sandbox.domain_single_package.domainB;

//import kaitlyn.sandbox.domain_single_package.domainA.iSPApiA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class SPDomainB {
    private SPRepoB repo;
//    private iSPApiA otherApi;

    @Autowired
    SPDomainB(SPRepoB repo
//            ,iSPApiA otherApi
    ){
        this.repo = repo;
//        this.otherApi = otherApi;
    }
}
