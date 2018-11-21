package com.kj.common.constant.model;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * 处理前端跨域问题
 *
 * @author Jason
 * @create 2017-05-10 20:47
 */
@Slf4j
public class PermissiveCORSFilter implements Filter {

    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z0-9 ,-_]*$");

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;

        String origin;
        String credentialFlag;
        if (request.getHeader("Origin") == null) {
            origin = "*";
            credentialFlag = "false";
        } else {
            origin = request.getHeader("Origin");
            credentialFlag = "true";
        }

        // need to do origin.toString() to avoid findbugs error about response splitting
        response.addHeader("Access-Control-Allow-Origin", origin.toString());
        response.setHeader("Access-Control-Allow-Credentials", credentialFlag);
        if ("OPTIONS".equals(request.getMethod())) {
            // log.info("Received OPTIONS request from origin:" + request.getHeader("Origin"));
            response.setHeader("Access-Control-Allow-Methods", "GET,POST,HEAD,OPTIONS,PUT,DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            String headers = StringUtils.trimToEmpty(request.getHeader("Access-Control-Request-Headers"));
            if (!PATTERN.matcher(headers).matches()) {
                throw new ServletException("Invalid value provided for 'Access-Control-Request-Headers' header");
            }
            response.setHeader("Access-Control-Allow-Headers", headers); // allow any headers
        }
        try {
            chain.doFilter(req, res);
        } catch (Exception e) {
//            log.error("跨域处理异常，请求参数url：{}", request.getRequestURI(), e);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
        // Do nothing
    }

    @Override
    public void destroy() {
        // Do nothing
    }
}