package mono.com.symbol.emdk;


public class EMDKManager_StatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.symbol.emdk.EMDKManager.StatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStatus:(Lcom/symbol/emdk/EMDKManager$StatusData;Lcom/symbol/emdk/EMDKBase;)V:GetOnStatus_Lcom_symbol_emdk_EMDKManager_StatusData_Lcom_symbol_emdk_EMDKBase_Handler:Symbol.XamarinEMDK.EMDKManager/IStatusListenerInvoker, Symbol.XamarinEMDK\n" +
			"";
		mono.android.Runtime.register ("Symbol.XamarinEMDK.EMDKManager+IStatusListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", EMDKManager_StatusListenerImplementor.class, __md_methods);
	}


	public EMDKManager_StatusListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == EMDKManager_StatusListenerImplementor.class)
			mono.android.TypeManager.Activate ("Symbol.XamarinEMDK.EMDKManager+IStatusListenerImplementor, Symbol.XamarinEMDK, Version=2.4.0.87, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onStatus (com.symbol.emdk.EMDKManager.StatusData p0, com.symbol.emdk.EMDKBase p1)
	{
		n_onStatus (p0, p1);
	}

	private native void n_onStatus (com.symbol.emdk.EMDKManager.StatusData p0, com.symbol.emdk.EMDKBase p1);

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
