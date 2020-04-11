package entities;
import java.util.Date;

import entities.enums.status_pedido;

public class pedido {
	private Integer id;
	private Date momento;
	private status_pedido status;
	
	public pedido() {
		
	}

	public pedido(Integer id, Date momento, status_pedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	@Override
	public String toString() {
		return "pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public status_pedido getStatus() {
		return status;
	}

	public void setStatus(status_pedido status) {
		this.status = status;
	}
	
	
	
}
