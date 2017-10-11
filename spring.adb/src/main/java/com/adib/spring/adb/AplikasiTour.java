package com.adib.spring.adb;

import com.adib.spring.adb.model.Penumpang;
import com.adib.spring.adb.model.Tiket;
import com.adib.spring.adb.model.Travel;
import com.adib.spring.adb.repository.PenumpangRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.adib.spring.adb.repository.TiketRepository;
import com.adib.spring.adb.repository.TravelRepository;
import java.sql.Date;

@SpringBootApplication
public class AplikasiTour {

    public static void main(String[] args) {

        ApplicationContext springContext = SpringApplication.run(AplikasiTour.class, args);
        PenumpangRepository penumpangRepository = springContext.getBean(PenumpangRepository.class);
        Penumpang penumpang1 = penumpangRepository.save(new Penumpang(1, "lukman", "0812341234213", "Jl.cisaranten"));
        Penumpang penumpang2 = penumpangRepository.save(new Penumpang(2, "Akbar", "0918234483343", "Jl. Melawai"));
        Penumpang penumpang3 = penumpangRepository.save(new Penumpang(3, "Dewa Ngoman ", "0900934483343", "Jl. panglima polim"));

        TravelRepository travelRepository = springContext.getBean(TravelRepository.class);
        Travel travel1 = travelRepository.save(new Travel(1, "Eko", "0813284343433", "Jl.cisaranten", "D 2524 ZZC"));
        Travel travel2 = travelRepository.save(new Travel(2, "Budi", "0918234483343", "Jl. Melawai", "B 4343 KDF"));
        Travel travel3 = travelRepository.save(new Travel(3, "Adi Putra ", "0900934483343", "Jl. panglima polim ", "B 2343 DKJ"));

        TiketRepository tiketRepository = springContext.getBean(TiketRepository.class);
        tiketRepository.save(new Tiket(1, Date.valueOf("2017-10-20"), penumpang1, travel1));
        tiketRepository.save(new Tiket(2, Date.valueOf("2017-10-20"), penumpang2, travel3));
        tiketRepository.save(new Tiket(3, Date.valueOf("2017-10-20"), penumpang3, travel2));

    }
}
