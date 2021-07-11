package tpComposite.shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Tree implements IShapeShifter {
	
	ArrayList<IShapeShifter> leafs;
	
	public Tree() {
		this.leafs = new ArrayList<IShapeShifter>();
	}

	@Override
	public IShapeShifter compose(IShapeShifter ishape) {
		this.leafs.add(ishape);
		return this;
	}

	@Override
	public int deepest() {
		int res = 1;
		for(int i = 0; i < this.leafs.size(); i++) {
			res = res + this.leafs.get(i).deepest();
		}
		
		return res;
	}

	@Override
	public IShapeShifter flat() {
		Tree shifterFlated = new Tree();
		
		this.leafs.forEach(l -> shifterFlated.compose(l.flat()));
		return shifterFlated;
	}

	@Override
	public List<Integer> values() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		this.leafs.forEach(l -> values.addAll(l.values()));
		return values;
	}

	
}
