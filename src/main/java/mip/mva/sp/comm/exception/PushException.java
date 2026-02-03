package mip.mva.sp.comm.exception;

/**
 * @Project 모바일 운전면허증 서비스 구축 사업
 * @PackageName mip.mva.sp.comm.exception
 * @FileName PushException.java
 * @Author Min Gi Ju
 * @Date 2022. 6. 7.
 * @Description PUSH Exception
 * 
 * <pre>
 * ==================================================
 * DATE            AUTHOR           NOTE
 * ==================================================
 * 2024. 5. 28.    민기주           최초생성
 * </pre>
 */
public class PushException extends Exception {

	private static final long serialVersionUID = 1L;

	/** 오류코드 */
	private Integer errcode;
	/** 오류메세지 */
	private String errmsg;
	/** 거래코드 */
	private String trxcode;

	/**
	 * 생성자
	 * 
	 * @param errcode 오류코드
	 * @param errmsg 오류메세지
	 * @param trxcode 거래코드
	 */
	public PushException(Integer errcode, String errmsg, String trxcode) {
		super();

		this.errcode = errcode;
		this.errmsg = errmsg;
		this.trxcode = trxcode;
	}

	public String getTrxcode() {
		return trxcode;
	}

	public void setTrxcode(String trxcode) {
		this.trxcode = trxcode;
	}

	public Integer getErrcode() {
		return errcode;
	}

	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}
