package mono.com.symbol.emdk.barcode;


public class Scanner_DataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.barcode.Scanner.DataListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onData:(Lcom/symbol/emdk/barcode/ScanDataCollection;)V:GetOnData_Lcom_symbol_emdk_barcode_ScanDataCollection_Handler:Symbol.XamarinEMDK.Barcode.Scanner/IDataListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.Barcode.Scanner+IDataListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", Scanner_DataListenerImplementor.class, __md_methods);
	}


	public Scanner_DataListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Scanner_DataListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.Barcode.Scanner+IDataListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onData (com.symbol.emdk.barcode.ScanDataCollection p0)
	{
		n_onData (p0);
	}

	private native void n_onData (com.symbol.emdk.barcode.ScanDataCollection p0);

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
