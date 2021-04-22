public class Edge {
    private int start;			// Edge start point
    private int end;			// Edge end point
    private String label;       // Edge label
    private String start_str;
    private String end_str;

    public Edge(int _start, int _end, String _label){
        start = _start;
        end = _end; 
        label = _label;
    }

    public Edge(String _start, String _end, String _label){
        start_str = _start;
        end_str = _end;
        label = _label;
    }
    
    public int GetStart() {	return start;  }
    
    public int GetEnd() { return end; }

    public String GetStartString() {	return start_str;  }

    public String GetEndString() { return end_str; }

    public String GetLabel() {return label;}
    
	public String toString() {
		return "Edge(" + start + "," + end + "). Label = " + label + ".";
	}
	
	// Check whether Edge "_edge" is the same as the current one
	public boolean isSameEdge(Edge _edge) {	
		return (start == _edge.GetStart() && end == _edge.GetEnd() && label.equals(_edge.GetLabel()));
	}
}
