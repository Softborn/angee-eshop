package e_shop.service;

import e_shop.mapper.EShopMapper;
import e_shop.model.Watch;
import e_shop.validator.EShopValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class EShopService {

    @Autowired
    private EShopValidator eShopValidator;

    @Autowired
    private EShopMapper eShopMapper;

    public Watch getWatch(){
        return eShopMapper.mapToDefaultWatch();
    }

    public Watch uploadWatch(Watch watch) {
        eShopValidator.validateWatch(watch);

        return storeToDatabase(watch);
    }

    private Watch storeToDatabase(Watch watch) {
        // simulation
        Watch coolWatch = eShopMapper.mapToProcessedWatch(watch);
        coolWatch.setId(ThreadLocalRandom.current().nextInt());

        return coolWatch;
    }

}
