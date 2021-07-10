package tpComposite.shapeShifter;

import java.util.List;

public interface IShapeShifter {
	public IShapeShifter compose(IShapeShifter ishape);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
}
