package com.example.monkeypoxwithfragment.databinding;
import com.example.monkeypoxwithfragment.R;
import com.example.monkeypoxwithfragment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentContactUsBindingImpl extends FragmentContactUsBinding  {

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
        sViewsWithIds.put(R.id.contactUsClick, 6);
        sViewsWithIds.put(R.id.txt2, 7);
        sViewsWithIds.put(R.id.imgPhone, 8);
        sViewsWithIds.put(R.id.txtPhone, 9);
        sViewsWithIds.put(R.id.imgMail, 10);
        sViewsWithIds.put(R.id.txtMail, 11);
        sViewsWithIds.put(R.id.imgLoc, 12);
        sViewsWithIds.put(R.id.TPhone, 13);
        sViewsWithIds.put(R.id.editTextTextPersonName, 14);
        sViewsWithIds.put(R.id.editTextTextEmailAddress2, 15);
        sViewsWithIds.put(R.id.editTextPhone, 16);
        sViewsWithIds.put(R.id.mesagee, 17);
        sViewsWithIds.put(R.id.sendMsg, 18);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentContactUsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentContactUsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[16]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[14]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.EditText) bindings[17]
            , (android.widget.Button) bindings[18]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
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