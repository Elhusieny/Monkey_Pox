package com.example.monkeypoxwithfragment.databinding;
import com.example.monkeypoxwithfragment.R;
import com.example.monkeypoxwithfragment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentApplyAsADoctorBindingImpl extends FragmentApplyAsADoctorBinding  {

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
        sViewsWithIds.put(R.id.ApplyAsadoctorClick, 6);
        sViewsWithIds.put(R.id.textView1, 7);
        sViewsWithIds.put(R.id.DrName, 8);
        sViewsWithIds.put(R.id.textView2, 9);
        sViewsWithIds.put(R.id.sp_Gender, 10);
        sViewsWithIds.put(R.id.textView3, 11);
        sViewsWithIds.put(R.id.country, 12);
        sViewsWithIds.put(R.id.textView4, 13);
        sViewsWithIds.put(R.id.Email, 14);
        sViewsWithIds.put(R.id.textView5, 15);
        sViewsWithIds.put(R.id.Governorate, 16);
        sViewsWithIds.put(R.id.textView6, 17);
        sViewsWithIds.put(R.id.shortreview, 18);
        sViewsWithIds.put(R.id.textView7, 19);
        sViewsWithIds.put(R.id.selectImg, 20);
        sViewsWithIds.put(R.id.textView8, 21);
        sViewsWithIds.put(R.id.imagemedicalsyndicate, 22);
        sViewsWithIds.put(R.id.textView9, 23);
        sViewsWithIds.put(R.id.selectCertificate, 24);
        sViewsWithIds.put(R.id.syndicate_number, 25);
        sViewsWithIds.put(R.id.submitButton, 26);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentApplyAsADoctorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentApplyAsADoctorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[16]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Spinner) bindings[12]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.EditText) bindings[24]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.EditText) bindings[18]
            , (android.widget.Spinner) bindings[10]
            , (android.widget.Button) bindings[26]
            , (android.widget.EditText) bindings[25]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[23]
            , (android.widget.ImageView) bindings[1]
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