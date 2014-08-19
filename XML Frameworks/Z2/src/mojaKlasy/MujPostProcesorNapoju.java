package mojaKlasy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MujPostProcesorNapoju implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String byName)
			throws BeansException {

		if (bean instanceof Herbata) {
			// ((Herbata) bean).pijNapuj();
		}
		if (bean instanceof Czlowiek) {
			((Czlowiek) bean).robienieCzlowieka();
			System.out.println("Czlowiek wsypuje ziarenka do mlynka na 1 porcje kawy");
			bean = new Kawa();
			Kawa.licznikKawy++;
			
		}
		if (bean instanceof Kawa) {
			
			

			if (Kawa.licznikKawy > 0) {
				((Kawa) bean).pijNapuj();
				Kawa.licznikKawy--;
			} 
			else if (((Kawa) bean).licznikKawy <= 0) {

				System.out.println("Brak kawy w automacie przelaczam na Herbate");
				bean = new Herbata();
				((Herbata) bean).pijNapuj();
			}
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String byName)
			throws BeansException {

		return bean;
	}

}
