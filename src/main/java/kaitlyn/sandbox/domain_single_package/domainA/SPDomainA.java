package kaitlyn.sandbox.domain_single_package.domainA;

//import kaitlyn.sandbox.domain_single_package.domainB.iSPApiB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class SPDomainA {
    private SPRepoA repo;
//    private iSPApiB otherApi;

    @Autowired
    SPDomainA(SPRepoA repo
//            , iSPApiB otherApi
    ){
        this.repo = repo;
//        this.otherApi = otherApi;
    }
}
