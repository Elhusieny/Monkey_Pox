package com.example.monkeypoxwithfragment.databinding;
import com.example.monkeypoxwithfragment.R;
import com.example.monkeypoxwithfragment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAboutfBindingImpl extends FragmentAboutfBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top, 1);
        sViewsWithIds.put(R.id.heade, 2);
        sViewsWithIds.put(R.id.ic_home, 3);
        sViewsWithIds.put(R.id.HomeClick, 4);
        sViewsWithIds.put(R.id.ic_arrowRight, 5);
        sViewsWithIds.put(R.id.aboutfClick, 6);
        sViewsWithIds.put(R.id.mprelated, 7);
        sViewsWithIds.put(R.id.aboutFText, 8);
        sViewsWithIds.put(R.id.howSpread, 9);
        sViewsWithIds.put(R.id.con, 10);
        sViewsWithIds.put(R.id.fewWays, 11);
        sViewsWithIds.put(R.id.txtSpreadWays, 12);
        sViewsWithIds.put(R.id.txtDirectCon, 13);
        sViewsWithIds.put(R.id.txtdcCanHappen, 14);
        sViewsWithIds.put(R.id.txtOral, 15);
        sViewsWithIds.put(R.id.txtHugging, 16);
        sViewsWithIds.put(R.id.txtProlonged, 17);
        sViewsWithIds.put(R.id.txtRiskLow, 18);
        sViewsWithIds.put(R.id.pot, 19);
        sViewsWithIds.put(R.id.txtPot, 20);
        sViewsWithIds.put(R.id.posCom, 21);
        sViewsWithIds.put(R.id.txtBron, 22);
        sViewsWithIds.put(R.id.txtSepsis, 23);
        sViewsWithIds.put(R.id.txtInf, 24);
        sViewsWithIds.put(R.id.txtInflection, 25);
        sViewsWithIds.put(R.id.secInf, 26);
        sViewsWithIds.put(R.id.imgTreatment, 27);
        sViewsWithIds.put(R.id.howTreatment, 28);
        sViewsWithIds.put(R.id.txtNoTreatment, 29);
        sViewsWithIds.put(R.id.txtMedications, 30);
        sViewsWithIds.put(R.id.txtVacciniaV, 31);
        sViewsWithIds.put(R.id.txtImmune, 32);
        sViewsWithIds.put(R.id.txtAntiviral, 33);
        sViewsWithIds.put(R.id.txtTecovirimat, 34);
        sViewsWithIds.put(R.id.txtBrincidofovir, 35);
        sViewsWithIds.put(R.id.txtCidofovir, 36);
        sViewsWithIds.put(R.id.imageSymptoms, 37);
        sViewsWithIds.put(R.id.sym, 38);
        sViewsWithIds.put(R.id.txtsymptoms, 39);
        sViewsWithIds.put(R.id.txtEarlySymptoms, 40);
        sViewsWithIds.put(R.id.txtHeadache, 41);
        sViewsWithIds.put(R.id.txtMuscle, 42);
        sViewsWithIds.put(R.id.txtBackAches, 43);
        sViewsWithIds.put(R.id.txtFatige, 44);
        sViewsWithIds.put(R.id.txtChills, 45);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAboutfBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private FragmentAboutfBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[28]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[37]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[21]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[38]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[43]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[44]
            , (android.widget.TextView) bindings[41]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[42]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[39]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}