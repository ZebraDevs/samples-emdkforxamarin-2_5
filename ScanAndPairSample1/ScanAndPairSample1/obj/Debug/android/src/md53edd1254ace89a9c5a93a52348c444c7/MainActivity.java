package md53edd1254ace89a9c5a93a52348c444c7;


public class MainActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.EMDKManager.EMDKListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onClosed:()V:GetOnClosedHandler:Symbol.XamarinEMDK.EMDKManager/IEMDKListenerInvoker, Symbol.XamarinEMDK\n" +
			"n_onOpened:(Lcom/symbol/emdk/EMDKManager;)V:GetOnOpened_Lcom_symbol_emdk_EMDKManager_Handler:Symbol.XamarinEMDK.EMDKManager/IEMDKListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("ScanAndPairSample1.MainActivity, ScanAndPaiSample1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity.class, __md_methods);
	}


	public MainActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("ScanAndPairSample1.MainActivity, ScanAndPaiSample1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public void onClosed ()
	{
		n_onClosed ();
	}

	private native void n_onClosed ();


	public void onOpened (com.symbol.emdk.EMDKManager p0)
	{
		n_onOpened (p0);
	}

	private native void n_onOpened (com.symbol.emdk.EMDKManager p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
