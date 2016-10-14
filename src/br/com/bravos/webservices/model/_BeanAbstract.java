package br.com.bravos.webservices.model;

/**
 * @author JamessonSena
 *
 */
public class _BeanAbstract {
	private boolean success = false;
	private String detail ="Erro", reason = "-1";

	/**
	 * @param success
	 * @param detail
	 * @param reason
	 */
	public _BeanAbstract(boolean success, String detail, String reason) {
		super();
		this.success = success;
		this.detail = detail;
		this.reason = reason;
	}

	
	/**
	 * 
	 */
	public _BeanAbstract() {
	}


	/**
	 * @return transa��o realizada com sucesso
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success - se a transa��o foi realizada com sucesso
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return o detalhe da transa��o
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return a raz�o do erro/sucesso da transa��o
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "_BeanAbstract [success=" + success + ", detail=" + detail + ", reason=" + reason + "]";
	}

}
