create or replace procedure search_zipcode
(i_dong varchar2, vaild_result out number)
is
 	vaild_result number := 0; 
 	temp_val number :=0; --연산결과를 저장할 변수
 	flag_num char(1); -- 주민번호의 끝자리
 	idx number :=2; 
 	temp_ssn varchar2(13);

begin
    
    if check_ssn(ssn) = 'success' then 
    	temp_ssn :=substr(ssn,1,6)||substr(ssn,8,6);
    	flag_num := substr(ssn,14,1);
    	--temp_ssn 880101123456
    	for i in 1.. length(temp_ssn)loop
    		temp_val:=temp_val+ substr(temp_ssn,i,1)*idx;  
    		
    		idx:=idx+1;
    		if idx = 10 then
    			idx:=2;
    		end if;
    	end loop;
    	
    		temp_val:=mod(11-mod(temp_val,11),10);
    		if temp_val =  flag_num then
    		result_msg:='유효';
    		end if;
    end if;
     
	return result_msg;
end;
/
end;