## Group layout

GroupLayout is a LayoutManager that hierarchically group the components and arranges them in a Container. Grouping is done by using the instances of the Group class. It is generally used for developing a GUI ( Graphic User Interface) builders such as Matisse, the GUI builder provided with the NetBeans IDE. GroupLayout Class supports two types of groups:

-A sequential group positions its child elements sequentially, one after another.
-A parallel group aligns its child elements in different ways.

GroupLayout treats each axis independently. That is, there is a group representing the horizontal axis, and a group representing the vertical axis. Each component must exists in both a horizontal and vertical group, otherwise an IllegalStateException is thrown during layout, or when the minimum, preferred or maximum size is requested.