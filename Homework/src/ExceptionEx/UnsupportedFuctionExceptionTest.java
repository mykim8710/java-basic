package ExceptionEx;

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;

	public UnsupportedFuctionException(String message, int errCode) {
		super(message);
		ERR_CODE = errCode;
	}

	public UnsupportedFuctionException(String message) {
		this(message, 100);
	}

	public int getErrorCode() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		return super.getMessage() + " " + getErrorCode();
	}
}

class UnsupportedFuctionExceptionTest {
	public static void main(String[] args) {
		throw new UnsupportedFuctionException("지원하지않는 기능입니다.", 100);
	}
}

