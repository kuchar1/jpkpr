package mojaKlasy;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Czlowiek implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	
	
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		this.publisher= arg0;
		
	}

	public void wyslijKomunikat(){
		publisher.publishEvent(new Zdarzenia(this));
	}
}
