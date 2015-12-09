package com.practicapost.jtoscano.practicapost.UI;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.practicapost.jtoscano.practicapost.interfacepepona.IApiFNList;
import com.practicapost.jtoscano.practicapost.interfacepepona.IApiOperator;
import com.practicapost.jtoscano.practicapost.interfacepepona.IApiRatePlan;
import com.practicapost.jtoscano.practicapost.interfacepepona.IApiVersion;
import com.practicapost.jtoscano.practicapost.R;
import com.practicapost.jtoscano.practicapost.models.FNListIn.FNListIn;
import com.practicapost.jtoscano.practicapost.models.FNListIn.QueryFNListsRequest;
import com.practicapost.jtoscano.practicapost.models.FNListOut.Current;
import com.practicapost.jtoscano.practicapost.models.FNListOut.FrequentNumberList;
import com.practicapost.jtoscano.practicapost.models.FNListOut.ListMemberBasicInfo;
import com.practicapost.jtoscano.practicapost.models.FNListOut.QueryFNListsResponse;
import com.practicapost.jtoscano.practicapost.models.FNListOut.ResultInfo;
import com.practicapost.jtoscano.practicapost.models.getoperatorin.GetOperator;
import com.practicapost.jtoscano.practicapost.models.getoperatorin.GetOperatorRequest;
import com.practicapost.jtoscano.practicapost.models.getoperatorin.HeaderInOperator;
import com.practicapost.jtoscano.practicapost.models.getoperatorin.LogicalResource;
import com.practicapost.jtoscano.practicapost.models.getoperatorin.ResourceSpecification;
import com.practicapost.jtoscano.practicapost.models.getoperatorout.GetOperatorResponse;
import com.practicapost.jtoscano.practicapost.models.getoperatorout.HeaderOut;
import com.practicapost.jtoscano.practicapost.models.headerin.HeaderIn;
import com.practicapost.jtoscano.practicapost.models.headerin.Model;
import com.practicapost.jtoscano.practicapost.models.headerout.VersionAPKResponse;
import com.practicapost.jtoscano.practicapost.models.rateplanin.QueryRateplanRequest;
import com.practicapost.jtoscano.practicapost.models.rateplanin.RatePlanIn;
import com.practicapost.jtoscano.practicapost.models.rateplanout.QueryRateplanResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

/**
 * Created by jtoscano on 07/12/2015.
 */

public class MainActivityFragment extends Fragment {

    private static final String BASE_URL = "http://telefonica.movistar.com.mx";
    private Button mBoton;
    private TextView mRespuesta;
    private TextView mRespuesta2;
    private TextView mRespuesta3;
    private TextView mRespuesta4;
    private TextView mRespuesta5;
    private TextView mRespuesta6;
    private TextView mRespuesta7;
    private TextView mRespuesta8;
    private TextView mRespuesta9;
    private TextView mRespuesta10;
    private TextView mRespuesta11;
    private TextView mRespuesta12;
    private TextView mRespuesta13;
    private Model mModel;
    private HeaderIn mHeaderIn;
    private GetOperator mOperator;
    private GetOperatorRequest mOperatorRequest;
    private ResourceSpecification mSpecification;
    private LogicalResource mLogicalResource;
    private HeaderInOperator mHeaderInOperator;
    private RestAdapter adapter;
    private EditText mEdit;
    private com.practicapost.jtoscano.practicapost.models.rateplanin.HeaderIn mPlanHeaderIn;
    private com.practicapost.jtoscano.practicapost.models.rateplanin.LogicalResource mPlanLogicalResource;
    private QueryRateplanRequest mQueryRateplanRequest;
    private RatePlanIn mRatePlanIn;
    private com.practicapost.jtoscano.practicapost.models.rateplanin.ResourceSpecification mResourceSpecification;
    private FNListIn mFnListIn;
    private com.practicapost.jtoscano.practicapost.models.FNListIn.HeaderIn mFNHeaderIn;
    private com.practicapost.jtoscano.practicapost.models.FNListIn.LogicalResource mFNLogicalResource;
    private QueryFNListsRequest mQueryFNListsRequest;
    private com.practicapost.jtoscano.practicapost.models.FNListIn.ResourceSpecification mFNResourceSpecification;
    private QueryFNListsResponse queryFNListsResponse;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mBoton = (Button) view.findViewById(R.id.Boton);
        mEdit = (EditText) view.findViewById(R.id.edit);
        mRespuesta = (TextView) view.findViewById(R.id.respuesta);
        mRespuesta2 = (TextView) view.findViewById(R.id.respuesta2);
        mRespuesta3 = (TextView) view.findViewById(R.id.respuesta3);
        mRespuesta4 = (TextView) view.findViewById(R.id.respuesta4);
        mRespuesta5 = (TextView) view.findViewById(R.id.respuesta5);
        mRespuesta6 = (TextView) view.findViewById(R.id.respuesta6);
        mRespuesta7 = (TextView) view.findViewById(R.id.respuesta7);
        mRespuesta8 = (TextView) view.findViewById(R.id.respuesta8);
        mRespuesta9 = (TextView) view.findViewById(R.id.respuesta9);
        mRespuesta10 = (TextView) view.findViewById(R.id.respuesta10);
        mRespuesta11 = (TextView) view.findViewById(R.id.respuesta11);
        mRespuesta12 = (TextView) view.findViewById(R.id.respuesta12);
        mRespuesta13 = (TextView) view.findViewById(R.id.respuesta13);

        adapter = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        versionOnclick();


        return view;
    }

    private void versionOnclick() {
        mBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llenarModel();
                IApiVersion api = adapter.create(IApiVersion.class);
                api.Authenticate(mModel, new Callback<Response>() {
                    @Override
                    public void success(Response response, Response response2) {
                        String respuestaTBA = new String(((TypedByteArray) response.getBody()).getBytes());
                        String jsonStr = "[" + respuestaTBA + "]";
                        llenarRespuestaVersion(jsonStr);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        error.getBody();
                    }
                });
                operadorOnclick();
                ratePlanOnclick();
                fnListOnclick();
            }
        });
    }

    private void llenarModel() {
        mHeaderIn = new HeaderIn();
        mModel = new Model();
        mModel.setHeaderIn(mHeaderIn);
        mHeaderIn.setCountry("MX");
        mHeaderIn.setDestination("MX:TEMM:AUTOGESTION:AUTOGESTION");
        mHeaderIn.setEntity("CANAL");
        mHeaderIn.setExecId("550e8400-e29b-41d4-a716-446655440000");
        mHeaderIn.setLang("ES");
        mHeaderIn.setOperation("VersionAPK");
        mHeaderIn.setOriginator("MX:TEMM:CANAL:CANAL");
        mHeaderIn.setSubsystem("CANAL");
        mHeaderIn.setSystem("Extranet");
        mHeaderIn.setTimestamp("2015-06-08T10:35:47.233+01:00");
        mHeaderIn.setUserId("USER CANAL");
        mModel.setMetodo("VersionAPK");
    }

    private void llenarRespuestaVersion(String jsonStr) {
        Gson gson = new GsonBuilder().create();
        try {
            JSONArray jsonArray = new JSONArray(jsonStr);
            JSONObject jsonObject = jsonArray.getJSONObject(1);
            String version = jsonObject.getString("versionAPKResponse");
            VersionAPKResponse apkResponse = gson.fromJson(version, VersionAPKResponse.class);
            mRespuesta.setText(getText(R.string.version) + " " + apkResponse.getVersion());
        } catch (Exception e) {
            Log.d("Error: ", e.getMessage());
        }
    }

    private void operadorOnclick() {
        if (mEdit.getText().length() == 10) {
            llenarOperador();
            IApiOperator api = adapter.create(IApiOperator.class);
            api.Authenticate(mOperator, new Callback<Response>() {
                @Override
                public void success(Response response, Response response2) {
                    String respuesta = new String(((TypedByteArray) response.getBody()).getBytes());
                    String jsonStr = "[" + respuesta + "]";
                    llenarRespuestaOperator(jsonStr);
                }

                @Override
                public void failure(RetrofitError error) {
                    error.getBody();
                }
            });
        } else {
            Toast.makeText(getContext(), R.string.error, Toast.LENGTH_LONG).show();
        }
    }

    private void llenarOperador() {
        mOperator = new GetOperator();
        mOperatorRequest = new GetOperatorRequest();
        mSpecification = new ResourceSpecification();
        mLogicalResource = new LogicalResource();
        mHeaderInOperator = new HeaderInOperator();

        mOperator.setMetodo("GetOperator");
        mOperator.setHeaderIn(mHeaderInOperator);
        mHeaderInOperator.setCountry("MX");
        mHeaderInOperator.setLang("ES");
        mHeaderInOperator.setEntity("CANAL");
        mHeaderInOperator.setSystem("App");
        mHeaderInOperator.setSubsystem("CANAL");
        mHeaderInOperator.setOriginator("MX:TEMM:CANAL:CANAL");
        mHeaderInOperator.setUserId("USER CANAL");
        mHeaderInOperator.setOperation("GetOperator");
        mHeaderInOperator.setDestination("MX:TEMM:AUTOGESTION:AUTOGESTION");
        mHeaderInOperator.setExecId("550e8400-e29b-41d4-a716-446655440000");
        mHeaderInOperator.setTimestamp("2015-27-24T09:30:47.233+01:00");
        mOperator.setGetOperatorRequest(mOperatorRequest);
        mOperatorRequest.setResourceSpecification(mSpecification);
        mSpecification.setLogicalResource(mLogicalResource);
        mLogicalResource.setMsisdn(mEdit.getText().toString());
    }

    private void llenarRespuestaOperator(String jsonStr) {
        Gson gson = new GsonBuilder().create();
        try {
            JSONArray jsonArray = new JSONArray(jsonStr);
            JSONObject headerOutObj = jsonArray.getJSONObject(0);
            String headerOutStr = headerOutObj.getString("HeaderOut");
            HeaderOut headerOut = gson.fromJson(headerOutStr, HeaderOut.class);
            JSONObject getOperatorObject = jsonArray.getJSONObject(1);
            String getOperatorStr = getOperatorObject.getString("getOperatorResponse");
            GetOperatorResponse getOperatorResponse = gson.fromJson(getOperatorStr, GetOperatorResponse.class);
            mRespuesta2.setText(getText(R.string.operador) + " " + getOperatorResponse.getResourceSpecification().getLogicalResource().getMsisdnType());

        } catch (Exception e) {
            Log.d("Error: ", e.getMessage());
        }

    }

    private void ratePlanOnclick() {
        if (mEdit.getText().length() == 10) {
            llenarRatePlan();
            IApiRatePlan api = adapter.create(IApiRatePlan.class);
            api.Authenticate(mRatePlanIn, new Callback<Response>() {
                @Override
                public void success(Response response, Response response2) {
                    String respuesta = new String(((TypedByteArray) response.getBody()).getBytes());
                    String jsonStr = "[" + respuesta + "]";
                    llenarRespuestaRatePlan(jsonStr);
                }

                @Override
                public void failure(RetrofitError error) {
                    error.getBody();
                }
            });
        } else {
            Toast.makeText(getContext(), R.string.error, Toast.LENGTH_LONG).show();
        }
    }

    private void llenarRatePlan() {
        mPlanHeaderIn = new com.practicapost.jtoscano.practicapost.models.rateplanin.HeaderIn();
        mPlanLogicalResource = new com.practicapost.jtoscano.practicapost.models.rateplanin.LogicalResource();
        mQueryRateplanRequest = new QueryRateplanRequest();
        mRatePlanIn = new RatePlanIn();
        mResourceSpecification = new com.practicapost.jtoscano.practicapost.models.rateplanin.ResourceSpecification();

        mRatePlanIn.setMetodo("QueryRateplan");
        mRatePlanIn.setHeaderIn(mPlanHeaderIn);
        mRatePlanIn.setQueryRateplanRequest(mQueryRateplanRequest);
        mPlanHeaderIn.setCountry("MX");
        mPlanHeaderIn.setLang("ES");
        mPlanHeaderIn.setEntity("CANAL");
        mPlanHeaderIn.setSystem("App");
        mPlanHeaderIn.setSubsystem("CANAL");
        mPlanHeaderIn.setOriginator("MX:TEMM:CANAL:CANAL");
        mPlanHeaderIn.setUserId("USER CANAL");
        mPlanHeaderIn.setOperation("QueryRateplan");
        mPlanHeaderIn.setDestination("MX:TEMM:AUTOGESTION:AUTOGESTION");
        mPlanHeaderIn.setExecId("550e8400-e29b-41d4-a716-446655440000");
        mPlanHeaderIn.setTimestamp("2015-27-24T09:30:47.233+01:00");
        mQueryRateplanRequest.setResourceSpecification(mResourceSpecification);
        mResourceSpecification.setLogicalResource(mPlanLogicalResource);
        mPlanLogicalResource.setMsisdn(mEdit.getText().toString());
    }

    private void llenarRespuestaRatePlan(String jsonStr) {
        Gson gson = new GsonBuilder().create();
        try {
            JSONArray jsonArray = new JSONArray(jsonStr);
            JSONObject headerOutObj = jsonArray.getJSONObject(0);
            String headerOutStr = headerOutObj.getString("HeaderOut");
            com.practicapost.jtoscano.practicapost.models.rateplanout.HeaderOut headerOut = gson.fromJson(headerOutStr, com.practicapost.jtoscano.practicapost.models.rateplanout.HeaderOut.class);
            JSONObject queryObj = jsonArray.getJSONObject(1);
            String queryStr = queryObj.getString("queryRateplanResponse");
            QueryRateplanResponse rateplanResponse = gson.fromJson(queryStr, QueryRateplanResponse.class);
            if (headerOut.getMsgType().equals("ERROR")) {
                mRespuesta3.setText(getText(R.string.rateplan) + "\n" + rateplanResponse.getResultInfo().getErrorDesc());
            } else {
                mRespuesta3.setText(getText(R.string.rateplan) + "\n" + getText(R.string.plan_nombre) + " " + rateplanResponse.getRatePlan().getName() + "\n" + getText(R.string.plan_plan) + " " + rateplanResponse.getRatePlan().getNamePlan() + "\n" + getText(R.string.plan_rentplan) + " " + rateplanResponse.getRatePlan().getRentPlan() + "\n" + getText(R.string.plan_type) + " " + rateplanResponse.getRatePlan().getType() + "\n" + getText(R.string.plan_desc) + " " + rateplanResponse.getRatePlan().getDescription() + "\n" + getText(R.string.plan_rfc) + " " + rateplanResponse.getRatePlan().getRfc());
            }
        } catch (Exception e) {
            Log.d("Error: ", e.getMessage());
        }
    }

    private void fnListOnclick() {
        if (mEdit.getText().length() == 10) {
            llenarFNList();
            IApiFNList api = adapter.create(IApiFNList.class);
            api.Authenticate(mFnListIn, new Callback<Response>() {
                @Override
                public void success(Response response, Response response2) {
                    String respuesta = new String(((TypedByteArray) response.getBody()).getBytes());
                    String jsonStr = "[" + respuesta + "]";
                    llenarRespuestaFNList(jsonStr);
                }

                @Override
                public void failure(RetrofitError error) {
                    error.getBody();
                }
            });
        } else {
            Toast.makeText(getContext(), R.string.error, Toast.LENGTH_LONG).show();
        }
    }

    private void llenarFNList() {
        mFnListIn = new FNListIn();
        mFNHeaderIn = new com.practicapost.jtoscano.practicapost.models.FNListIn.HeaderIn();
        mFNLogicalResource = new com.practicapost.jtoscano.practicapost.models.FNListIn.LogicalResource();
        mQueryFNListsRequest = new QueryFNListsRequest();
        mFNResourceSpecification = new com.practicapost.jtoscano.practicapost.models.FNListIn.ResourceSpecification();

        mFnListIn.setMetodo("QueryFNLists");
        mFnListIn.setHeaderIn(mFNHeaderIn);
        mFnListIn.setQueryFNListsRequest(mQueryFNListsRequest);
        mFNHeaderIn.setCountry("MX");
        mFNHeaderIn.setLang("ES");
        mFNHeaderIn.setEntity("CANAL");
        mFNHeaderIn.setSystem("App");
        mFNHeaderIn.setSubsystem("CANAL");
        mFNHeaderIn.setOriginator("MX:TEMM:CANAL:CANAL");
        mFNHeaderIn.setUserId("USER CANAL");
        mFNHeaderIn.setOperation("QueryFNLists");
        mFNHeaderIn.setDestination("MX:TEMM:AUTOGESTION:AUTOGESTION");
        mFNHeaderIn.setExecId("550e8400-e29b-41d4-a716-446655440000");
        mFNHeaderIn.setTimestamp("2015-27-24T09:30:47.233+01:00");
        mQueryFNListsRequest.setResourceSpecification(mFNResourceSpecification);
        mFNResourceSpecification.setLogicalResource(mFNLogicalResource);
        mFNLogicalResource.setMsisdn(mEdit.getText().toString());
    }

    private void llenarRespuestaFNList(String jsonStr) {
        Gson gson = new GsonBuilder().create();
        JsonParser jsonParser = new JsonParser();
        try {
            JSONArray jsonArray = new JSONArray(jsonStr);
            JSONObject headerOutObj = jsonArray.getJSONObject(0);
            String headerOutStr = headerOutObj.getString("HeaderOut");
            com.practicapost.jtoscano.practicapost.models.FNListOut.HeaderOut headerOut = gson.fromJson(headerOutStr, com.practicapost.jtoscano.practicapost.models.FNListOut.HeaderOut.class);
            JSONObject queryFNListObj = jsonArray.getJSONObject(1);
            String queryFNListStr = queryFNListObj.getString("queryFNListsResponse");
            String current = queryFNListObj.getJSONObject("queryFNListsResponse").getJSONObject("FrequentNumberList").getString("Current");
            JsonObject asJsonObject = jsonParser.parse(current).getAsJsonObject();
            JsonElement node = asJsonObject.get("ListMemberBasicInfo");
            if (node.isJsonObject()) {
                String listMemberStr = queryFNListObj.getJSONObject("queryFNListsResponse").getJSONObject("FrequentNumberList").getJSONObject("Current").getString("ListMemberBasicInfo");
                Current current1 = new Current();
                ListMemberBasicInfo[] listMemberBasicInfo = {gson.fromJson(listMemberStr, ListMemberBasicInfo.class)};
                current1.setListMemberBasicInfo(listMemberBasicInfo);
                ResultInfo resultInfo = gson.fromJson(queryFNListObj.getJSONObject("queryFNListsResponse").getString("resultInfo"), ResultInfo.class);

                FrequentNumberList frequentNumberList= new FrequentNumberList();
                frequentNumberList.setAvailableFrequentNumbers(queryFNListObj.getJSONObject("queryFNListsResponse").getJSONObject("FrequentNumberList").getString("availableFrequentNumbers"));
                frequentNumberList.setDescription(queryFNListObj.getJSONObject("queryFNListsResponse").getJSONObject("FrequentNumberList").getString("description"));
                frequentNumberList.setOpCost(queryFNListObj.getJSONObject("queryFNListsResponse").getJSONObject("FrequentNumberList").getString("opCost"));
                frequentNumberList.setPromotionId(queryFNListObj.getJSONObject("queryFNListsResponse").getJSONObject("FrequentNumberList").getString("promotionId"));
                frequentNumberList.setCurrent(current1);
                queryFNListsResponse = new QueryFNListsResponse();
                queryFNListsResponse.setFrequentNumberList(frequentNumberList);
                queryFNListsResponse.setResultInfo(resultInfo);
                if (!resultInfo.getErrorCode().equals("0")) {
                    limpiarText();
                } else {
                    if (resultInfo.getErrorCode().equals("0")) {
                        limpiarText();
                        mRespuesta4.setText(getText(R.string.fnlist) + "\n" + getText(R.string.fnlist_promoid) + " " + frequentNumberList.getPromotionId() + "\n" + getText(R.string.fnlist_desc) + " " + frequentNumberList.getDescription() + "\n\n" + getText(R.string.fnlist_available) + " " + frequentNumberList.getAvailableFrequentNumbers());
                        mRespuesta5.setText(getText(R.string.fnlist_member));
                    }
                    if (listMemberBasicInfo[0].getListType() != null) {
                        mRespuesta6.setText(getText(R.string.fnlist_para) + " " + listMemberBasicInfo[0].getListType() + ":");
                        mRespuesta7.setText(listMemberBasicInfo[0].getListMember()[0].getMsisdn() + "\n" + listMemberBasicInfo[0].getListMember()[1].getMsisdn() + "\n" + listMemberBasicInfo[0].getListMember()[2].getMsisdn() + "\n" + listMemberBasicInfo[0].getListMember()[3].getMsisdn() + "\n" + listMemberBasicInfo[0].getListMember()[4].getMsisdn());
                    }
                }
            } else {
                queryFNListsResponse = new QueryFNListsResponse();
                queryFNListsResponse = gson.fromJson(queryFNListStr, QueryFNListsResponse.class);
                if (!queryFNListsResponse.getResultInfo().getErrorCode().equals("0")) {
                    limpiarText();
                    mRespuesta4.setText(getText(R.string.fnlist) + "\n" + getText(R.string.fnlist_error));
                } else {
                    if (queryFNListsResponse.getResultInfo().getErrorCode().equals("0")) {
                        mRespuesta4.setText(getText(R.string.fnlist) + "\n" + getText(R.string.fnlist_promoid) + " " + queryFNListsResponse.getFrequentNumberList().getPromotionId() + "\n" + getText(R.string.fnlist_desc) + " " + queryFNListsResponse.getFrequentNumberList().getDescription() + "\n\n" + getText(R.string.fnlist_available) + " " + queryFNListsResponse.getFrequentNumberList().getAvailableFrequentNumbers());
                        mRespuesta5.setText(getText(R.string.fnlist_member));
                        if (queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[0].getListType() != null) {
                            mRespuesta6.setText(getText(R.string.fnlist_para) + " " + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[0].getListType() + ":");
                            mRespuesta7.setText(queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[0].getListMember()[0].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[0].getListMember()[1].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[0].getListMember()[2].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[0].getListMember()[3].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[0].getListMember()[4].getMsisdn());
                        }
                        if (queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[1].getListType() != null) {
                            mRespuesta8.setText(getText(R.string.fnlist_para) + " " + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[1].getListType() + ":");
                            mRespuesta9.setText(queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[1].getListMember()[0].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[1].getListMember()[1].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[1].getListMember()[2].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[1].getListMember()[3].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[1].getListMember()[4].getMsisdn());
                        }
                        if (queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListType() != null) {
                            mRespuesta10.setText(getText(R.string.fnlist_para) + " " + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListType() + ":");
                            mRespuesta11.setText(queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListMember()[0].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListMember()[1].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListMember()[2].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListMember()[3].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListMember()[4].getMsisdn());
                        }
                        if (queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[3].getListType() != null) {
                            mRespuesta12.setText(getText(R.string.fnlist_para) + " " + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[3].getListType() + ":");
                            mRespuesta13.setText(queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[3].getListMember()[0].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[3].getListMember()[1].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[3].getListMember()[2].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[2].getListMember()[3].getMsisdn() + "\n" + queryFNListsResponse.getFrequentNumberList().getCurrent().getListMemberBasicInfo()[3].getListMember()[4].getMsisdn());
                        }

                    }
                }
            }
        } catch (Exception e) {
            Log.d("Error: ", e.getMessage());
        }
        Log.d("Main","frequentNumberList");

    }
    private void limpiarText(){
        mRespuesta4.setText("");
        mRespuesta5.setText("");
        mRespuesta6.setText("");
        mRespuesta7.setText("");
        mRespuesta8.setText("");
        mRespuesta9.setText("");
        mRespuesta10.setText("");
        mRespuesta11.setText("");
        mRespuesta12.setText("");
        mRespuesta13.setText("");
    }
}
