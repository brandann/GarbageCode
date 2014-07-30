using Autodesk.AutoCAD.Runtime;
using Autodesk.AutoCAD.DatabaseServices;
using Autodesk.AutoCAD.Geometry;
using Autodesk.AutoCAD.ApplicationServices;
using Autodesk.AutoCAD.EditorInput;

namespace ClassLibrary1
{
    public class Class1
    {
        [CommandMethod("TEST")]
        public void HelloWorld(){
            Editor ed;
            ed = Application.DocumentManager.MdiActiveDocument.Editor;
            ed.WriteMessage("Brandan is the best, even better then Miah");
            Point p = new Point(1, 2);
            ed.WriteMessage("PointX: " + p.getX() + "\nPointY: " + p.getY());
            ed.GetSelection();
        }
    }

    public class Point
    {
        int x;
        int y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {this.x = x;}
        public void setY(int y) {this.y = y;}
        public int getX(){return x;}
        public int getY(){return y;}
    }
}
/*



Namespace HorizontalAttributes

   Public Class Commands

       ' Class variable to store the instance of our overrule
       Private Shared myOverrule As KeepStraightOverrule

       <CommandMethod("KeepStraight")>
       Public Shared Sub ImplementOverrule()

           'We only want to create our overrule instance once, 
           ' so we check if it already exists before we create it
           ' (i.e. this may be the 2nd time we've run the command)
           If myOverrule Is Nothing Then
               'Instantiate our overrule class
               myOverrule = New KeepStraightOverrule
               'Register the overrule
               Overrule.AddOverrule(
                 RXClass.GetClass(GetType(AttributeReference)),
                 myOverrule, False)
           End If
           'Make sure overruling is turned on so our overrule works
           Overrule.Overruling = True

       End Sub

   End Class

   'Our custom overrule class derived from TransformOverrule
   Public Class KeepStraightOverrule
       Inherits TransformOverrule

       'We want to change how an AttributeReference responds to being
       ' transformed (moved, rotated, etc.), so we override its
       ' standard TransformBy function.
       Public Overrides Sub TransformBy(ByVal entity As Entity,
                                        ByVal transform As Matrix3d)

           'Call the normal TransformBy function for the attribute
           ' reference we're overruling.
           MyBase.TransformBy(entity, transform)
           'We know entity must be an AttributeReference because 
           ' that is the only entity we registered the overrule for.
           Dim attRef As AttributeReference = entity
           'Set rotation of attribute reference to 0 (horizontal)
           attRef.Rotation = 0.0

       End Sub
   End Class
End Namespace

*/