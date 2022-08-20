package EFCandyMachuca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class MicroServicioHospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioHospedajeApplication.class, args);
	}

}