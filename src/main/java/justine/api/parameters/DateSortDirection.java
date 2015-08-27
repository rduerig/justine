package justine.api.parameters;

public enum DateSortDirection {
	
	ASC,
	
	DESC;
	
	public static DateSortDirection getDefault(){
		return DESC;
	}

}
