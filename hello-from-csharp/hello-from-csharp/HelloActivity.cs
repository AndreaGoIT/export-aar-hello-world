using Android.App;
using Android.OS;
using Android.Runtime;

namespace hello_from_csharp
{
    [Activity(Label = "HelloActivity"), Register("hello_from_csharp.HelloActivity")]
    public class HelloActivity : Activity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            SetContentView(Resource.Layout.hello);
        }
    }
}