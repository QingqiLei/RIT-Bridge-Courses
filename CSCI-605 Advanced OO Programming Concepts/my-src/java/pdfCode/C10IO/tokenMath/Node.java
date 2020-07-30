package C10IO.tokenMath;/*
 * Thanks to ats
 */

import java.io.Serializable;

/** base class to store and evaluate arithmetic expressions.
    Defines most value-functions so that subclasses need only deal
    with long and double arithmetic.
  */
public abstract class Node extends Number implements Serializable {

  /** maps byte arithmetic to long.
      @return truncated long value.
    */
  public byte byteValue () {
    return (byte)longValue();
  }

  /** maps short arithmetic to long.
      @return truncated long value.
    */
  public short shortValue () {
    return (short)longValue();
  }

  /** maps int arithmetic to long.
      @return truncated long value.
    */
  public int intValue () {
    return (int)longValue();
  }

  /** maps float arithmetic to double.
      @return truncated double value.
    */
  public float floatValue () {
    return (float)doubleValue();
  }

  /** represents a binary operator.
      Must be subclassed to provide evaluation.
    */
  protected abstract static class Binary extends Node {
    /** left operand subtree.
	@serial left operand subtree.
      */
    protected Number left;

    /** right operand subtree.
	@serial right operand subtree.
      */
    protected Number right;

    /** builds a node with two subtrees.
	@param left left subtree.
	@param right right subtree.
      */
    protected Binary (Number left, Number right) {
      this.left = left; this.right = right;
    }
  }

  /** represents a unary operator.
      Must be subclassed to provide evaluation.
    */
  protected abstract static class Unary extends Node {
    /** operand subtree.
	@serial operand subtree.
      */
    protected Number tree;

    /** builds a node with a subtree.
	@param tree subtree.
      */
    protected Unary (Number tree) {
      this.tree = tree;
    }
  }

  /** implements addition.
    */
  public static class Add extends Binary {
    /** builds a node with two subtrees.
	@param left left subtree.
	@param right right subtree.
      */
    public Add (Number left, Number right) {
      super(left, right);
    }

    /** implements long addition.
	@return sum of subtree values.
      */
    public long longValue () {
      return left.longValue() + right.longValue();
    }

    /** implements double addition.
	@return sum of subtree values.
      */
    public double doubleValue () {
      return left.doubleValue() + right.doubleValue();
    }
  }

  /** implements subtraction.
    */
  public static class Sub extends Binary {
    /** builds a node with two subtrees.
	@param left left subtree.
	@param right right subtree.
      */
    public Sub (Number left, Number right) {
      super(left, right);
    }

    /** implements long subtraction.
	@return difference of subtree values.
      */
    public long longValue () {
      return left.longValue() - right.longValue();
    }

    /** implements double subtraction.
	@return difference of subtree values.
      */
    public double doubleValue () {
      return left.doubleValue() - right.doubleValue();
    }
  }

  /** implements multiplication.
    */
  public static class Mul extends Binary {
    /** builds a node with two subtrees.
	@param left left subtree.
	@param right right subtree.
      */
    public Mul (Number left, Number right) {
      super(left, right);
    }

    /** implements long multiplication.
	@return product of subtree values.
      */
    public long longValue () {
      return left.longValue() * right.longValue();
    }

    /** implements double multiplication.
	@return product of subtree values.
      */
    public double doubleValue () {
      return left.doubleValue() * right.doubleValue();
    }
  }

  /** implements division.
    */
  public static class Div extends Binary {
    /** builds a node with two subtrees.
	@param left left subtree.
	@param right right subtree.
      */
    public Div (Number left, Number right) {
      super(left, right);
    }

    /** implements long division.
	@return quotient of subtree values.
      */
    public long longValue () {
      return left.longValue() / right.longValue();
    }

    /** implements double division.
	@return quotient of subtree values.
      */
    public double doubleValue () {
      return left.doubleValue() / right.doubleValue();
    }
  }

  /** implements modulus.
    */
  public static class Mod extends Binary {
    /** builds a node with two subtrees.
	@param left left subtree.
	@param right right subtree.
      */
    public Mod (Number left, Number right) {
      super(left, right);
    }

    /** implements long modulus.
	@return remainder after division of subtree values.
      */
    public long longValue () {
      return left.longValue() % right.longValue();
    }

    /** implements double modulus.
	@return remainder after division of subtree values.
      */
    public double doubleValue () {
      return left.doubleValue() % right.doubleValue();
    }
  }

  /** implements sign change.
    */
  public static class Minus extends Unary {
    /** builds a node with a subtree.
	@param tree subtree.
      */
    public Minus (Number tree) {
      super(tree);
    }

    /** implements long sign change.
	@return negative of subtree value.
      */
    public long longValue () {
      return - tree.longValue();
    }

    /** implements double sign change.
	@return negative of subtree values.
      */
    public double doubleValue () {
      return - tree.doubleValue();
    }
  }
}
