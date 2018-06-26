package mono.com.symbol.emdk.barcode;


public class Scanner_StatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.barcode.Scanner.StatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStatus:(Lcom/symbol/emdk/barcode/StatusData;)V:GetOnStatus_Lcom_symbol_emdk_barcode_StatusData_Handler:Symbol.XamarinEMDK.Barcode.Scanner/IStatusListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.Barcode.Scanner+IStatusListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", Scanner_StatusListenerImplementor.class, __md_methods);
	}


	public Scanner_StatusListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Scanner_StatusListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.Barcode.Scanner+IStatusListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onStatus (com.symbol.emdk.barcode.StatusData p0)
	{
		n_onStatus (p0);
	}

	private native void n_onStatus (com.symbol.emdk.barcode.StatusData p0);

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
