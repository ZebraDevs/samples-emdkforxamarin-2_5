package mono.com.symbol.emdk.simulscan;


public class SimulScanReader_DataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.simulscan.SimulScanReader.DataListerner
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onData:(Lcom/symbol/emdk/simulscan/SimulScanData;)V:GetOnData_Lcom_symbol_emdk_simulscan_SimulScanData_Handler:Symbol.XamarinEMDK.SimulScan.SimulScanReader/IDataListernerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.SimulScan.SimulScanReader+IDataListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", SimulScanReader_DataListenerImplementor.class, __md_methods);
	}


	public SimulScanReader_DataListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SimulScanReader_DataListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.SimulScan.SimulScanReader+IDataListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onData (com.symbol.emdk.simulscan.SimulScanData p0)
	{
		n_onData (p0);
	}

	private native void n_onData (com.symbol.emdk.simulscan.SimulScanData p0);

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
