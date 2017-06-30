package e_shop.mapper;

import e_shop.model.Watch;
import org.springframework.stereotype.Component;

@Component
public class EShopMapper {

    public Watch mapToDefaultWatch() {
        Watch watch = new Watch();
        watch.setId(0);
        watch.setTitle("Prim");
        watch.setPrice(25000);
        watch.setDescription("A watch with a water fountain picture");
        watch.setFountain("R0lGODlhAQABAIAAAAUEBAAAACwAAAAAAQABAAACAkQBADs=");

        return watch;
    }

    public Watch mapToProcessedWatch(Watch watch) {
        Watch processedWatch = new Watch();
        processedWatch.setTitle(watch.getTitle());
        processedWatch.setPrice(watch.getPrice());
        processedWatch.setDescription(watch.getDescription());
        processedWatch.setFountain(watch.getFountain());

        return processedWatch;
    }

}
