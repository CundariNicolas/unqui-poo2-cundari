package tpComposite.shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class Leaf implements IShapeShifter {
	private Integer value;
	
	public Leaf(Integer value) {
		this.value = value;
	}

	@Override
	public IShapeShifter compose(IShapeShifter ishape) {
		Tree nuevoShifter = new Tree();
		nuevoShifter.compose(this);
		nuevoShifter.compose(ishape);
		return nuevoShifter;
	}
	
	public Integer getValue() {
		return value;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(this.value);
		return values;
	}

}
