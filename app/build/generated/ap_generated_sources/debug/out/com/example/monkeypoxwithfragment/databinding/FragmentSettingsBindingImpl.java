package com.example.monkeypoxwithfragment.databinding;
import com.example.monkeypoxwithfragment.R;
import com.example.monkeypoxwithfragment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingsBindingImpl extends FragmentSettingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.night_mode_icon, 1);
        sViewsWithIds.put(R.id.switch_mode, 2);
        sViewsWithIds.put(R.id.notification_icon, 3);
        sViewsWithIds.put(R.id.private_account, 4);
        sViewsWithIds.put(R.id.securityIcon, 5);
        sViewsWithIds.put(R.id.TextIcon, 6);
        sViewsWithIds.put(R.id.languageIcon, 7);
        sViewsWithIds.put(R.id.sendUsMsg, 8);
        sViewsWithIds.put(R.id.aboutUs, 9);
        sViewsWithIds.put(R.id.IconLogout, 10);
        sViewsWithIds.put(R.id.textLogout, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[8]
            , (androidx.appcompat.widget.SwitchCompat) bindings[2]
            , (android.widget.TextView) bindings[11]
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