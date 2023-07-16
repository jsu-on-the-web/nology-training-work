// One way to implement an array with a dynamic size
package lists;

import java.util.Arrays;

public class DynamicArray {
    private int[] data;
    private int length = 0;
    private int bufferSize;

    public DynamicArray() {
        this.bufferSize = 5;
        this.data = new int[bufferSize];
    }

    /**
     * Prints the content of the 'data' array.
     *
     * @param  None   This function does not take any parameters.
     * @return None   This function does not return any value.
     */
    public void viewContent() {
        System.out.println(Arrays.toString(data));
    }

    /**
     * Adds an integer value to the data array.
     *
     * @param  value  the integer value to be added
     */
    public void add(int value) {
        this.data[this.length++] = value;
        if (this.length == this.bufferSize) {
            this.resize();
        }
    }

    /**
     * Retrieves the element at the specified index.
     *
     * @param  index  the index of the element to retrieve
     * @return        the element at the specified index
     */
    public int get(int index) {
        return this.data[index];
    }

    /**
     * Sets the value at the specified index in the data array.
     *
     * @param  index  the index at which to set the value
     * @param  value  the value to set
     */
    public void set(int index, int value) {
        this.data[index] = value;
    }

    /**
     * Retrieves the size of the object.
     *
     * @return the size of the object
     */
    public int size() {
        return this.length;
    }

    /**
     * Resizes the buffer of the current dynamic array.
     *
     * @param  None    This function does not take any parameters.
     * @return None    This function does not return any value.
     */
    private void resize() {
        this.bufferSize *= 2;
        this.data = Arrays.copyOf(this.data, this.bufferSize);
    }
}
