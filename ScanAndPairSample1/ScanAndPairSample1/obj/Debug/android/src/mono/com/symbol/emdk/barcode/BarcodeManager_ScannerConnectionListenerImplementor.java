package mono.com.symbol.emdk.barcode;


public class BarcodeManager_ScannerConnectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.barcode.BarcodeManager.ScannerConnectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionChange:(Lcom/symbol/emdk/barcode/ScannerInfo;Lcom/symbol/emdk/barcode/BarcodeManager$ConnectionState;)V:GetOnConnectionChange_Lcom_symbol_emdk_barcode_ScannerInfo_Lcom_symbol_emdk_barcode_BarcodeManager_ConnectionState_Handler:Symbol.XamarinEMDK.Barcode.BarcodeManager/IScannerConnectionListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.Barcode.BarcodeManager+IScannerConnectionListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", BarcodeManager_ScannerConnectionListenerImplementor.class, __md_methods);
	}


	public BarcodeManager_ScannerConnectionListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BarcodeManager_ScannerConnectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.Barcode.BarcodeManager+IScannerConnectionListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionChange (com.symbol.emdk.barcode.ScannerInfo p0, com.symbol.emdk.barcode.BarcodeManager.ConnectionState p1)
	{
		n_onConnectionChange (p0, p1);
	}

	private native void n_onConnectionChange (com.symbol.emdk.barcode.ScannerInfo p0, com.symbol.emdk.barcode.BarcodeManager.ConnectionState p1);

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
