package ejemplo01;

import java.time.LocalDateTime;

public class Informacion {
	private LocalDateTime fechaHoraFin;
	private Integer tamanio;
	private Long duracionMs;
	private Long iteraciones;
	public Informacion() {
		super();
	}
	public Integer getTamanio() {
		return tamanio;
	}
	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}
	public Long getDuracionMs() {
		return duracionMs;
	}
	public void setDuracionMs(Long duracionMs) {
		this.duracionMs = duracionMs;
	}
	public Long getIteraciones() {
		return iteraciones;
	}
	public void setIteraciones(Long iteraciones) {
		this.iteraciones = iteraciones;
	}
	public Informacion(Integer tamanio, Long duracionMs, Long iteraciones) {
		super();
		this.tamanio = tamanio;
		this.duracionMs = duracionMs;
		this.iteraciones = iteraciones;
	}
	
	public Informacion(LocalDateTime fechaHoraFin, Integer tamanio, Long duracionMs, Long iteraciones) {
		super();
		this.fechaHoraFin = fechaHoraFin;
		this.tamanio = tamanio;
		this.duracionMs = duracionMs;
		this.iteraciones = iteraciones;
	}
	
	@Override
	public String toString() {
		return "\""+this.fechaHoraFin+"\","+this.tamanio+","+this.iteraciones+","+this.duracionMs+System.getProperty("line.separator");
	
	}

}
