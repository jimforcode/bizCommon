package bizCommon;

import java.util.HashMap;
import java.util.Map;
enum RSKeyEnum{msg,data}
public class Result {

	private final static String RESULT_STATUS_KEY = "status";
	private final static String RESULT_OK_VAL = "ok";
	private final static String RESULT_ERROR_VAL = "error";

	private Map<String, Object> result;

	public static Result Ok() {
		Result rs = new Result();
		rs.setResult(new HashMap<String, Object>());
		rs.getResult().put(RESULT_STATUS_KEY, RESULT_OK_VAL);
		return rs;
	}
	public static Result Error() {
		Result rs = new Result();
		rs.setResult(new HashMap<String, Object>());
		rs.getResult().put(RESULT_STATUS_KEY, RESULT_ERROR_VAL);
		return rs;
	}
	
	public Result  setVal(RSKeyEnum key,Object val){
		this.result.put(key.name(), val);
		return this;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	private void setResult(Map<String, Object> result) {
		this.result = result;
	}

	
	
	public static void main(String[] args) {
		System.out.println(Result.Ok().setVal(RSKeyEnum.msg, "result msg").setVal(RSKeyEnum.data, "").getResult());
		System.out.println(Result.Error().setVal(RSKeyEnum.data, "result msg").getResult());
	 
	}
}
